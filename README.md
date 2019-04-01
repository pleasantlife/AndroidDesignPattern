# AndroidDesignPattern

## 1. 생성 패턴
 - 상황에 적절한 객체를 쉽고 간단하게 만들며 유지할 수 있는 패턴

 ### 1. Builder 패턴
  - 복잡한 인스턴스들을 조립하여 만드는 구조
  - 생성자에 많은 파라미터들을 넣어야 할 경우 빌더 패턴을 사용하면 가독성을 높일 수 있다. (각 인자가 어떤 의미를 지니고 있는지 알기 쉽다.)
  - 한 번에 객체를 생성하므로 객체 일관성이 깨지지 않으며, setter 메소드가 없어서 변경 불가능한 객체를 만들 수 있다.
  - 예시 : 안드로이드 Notification.Builder
  ```java
  Notification noti = new Notification.Builder(context)
                        .setSmallIcon(R.drawable.ic_launcher_foreground)
                        .setContentIntent(pendingIntent)
                        .setTicker(message)
                        .build();
  ```

  ### 2. Singleton 패턴
   - 최초로 객체를 생성한 후 그 객체를 계속 리턴 받을 수 있는 패턴
   - 앱 전체에서 동일한 클래스의 인스턴스 사용 가능
   - 예시
   ```java
   public class SampleSingleton {
    private static SampleSingleton instance = null;

    private SampleSingleton() {

    }

    public static SampleSingleton getInstance() {
        if (instance == null) {
            synchronized(this) {
                if (instance == null) {
                    instance = new SampleSingleton();
                }
            }
        }

        return instance;
        }
    }
   ```
## 2. 구조 패턴
 ### 1. 구조 패턴이란?
  - 기존에 생성되어 있는 클래스가 새롭게 구현하고자 하는 클래스와 맞지 않는 경우에 사용하는 패턴
  - 작은 클래스들을 합성하여 더 큰 클래스 구조를 생성하는 패턴
 
 ### 2. 어댑터 패턴
  - 서로 다른 두 개의 클래스를 연결하는 어댑터 클래스를 생성하여 사용하는 패턴
  - 안드로이드에서는 앱의 비즈니스 로직과 아이템 모델에 연결하는 경우에 많이 사용
  - 대표적인 예시로 리사이클러뷰와 리사이클러뷰 어댑터
  ```java
  public class RecyclerAdapter extends RecyclerView.Adapter<Holder> {
      Context context;
      List<Model> modelList;

      public RecyclerAdapter(Context context, List<Model> modelList){
          this.context = context;
          this.modelList = modelList;
      }

      @override
      public Holder onCreateViewHolder(ViewGroup parent, int viewType){
          View view = LayoutInflater.from(context).inflate(R.layout.item, parent, false);
          return new Holder(view);
      }

      @override
      public void onBindViewHolder(Holder holder, int position){
          Model model = modelList.get(position);
          holder.title = model.getTitle();
          holder.date = model.getDate();
      }

      @override
      public int getItemCount(){
          return modelList.size();
      }

  }
  ```  



## 3. 참고사이트
 - 디자인패턴 관련 서적(English) : https://x.coe.phuket.psu.ac.th/warodom/242-320/ebook/9781786467218-ANDROID_DESIGN_PATTERNS_AND_BEST_PRACTICE.pdf
 - 디자인패턴 관련 정리 블로그 : https://jusungpark.tistory.com/category/DesignPattern
 - 안드로이드 디자인 패턴 : http://chuumong.github.io/android/2017/01/16/%EC%95%88%EB%93%9C%EB%A1%9C%EC%9D%B4%EB%93%9C-%EB%94%94%EC%9E%90%EC%9D%B8-%ED%8C%A8%ED%84%B4
 - 안드로이드 디자인 패턴(기계인간 블로그) : https://johngrib.github.io/wiki/builder-pattern/
 - https://medium.com/@programmerr47/singletons-in-android-63ddf972a7e7
 - https://limkydev.tistory.com/category/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%B0%8D/Design_Pattern 