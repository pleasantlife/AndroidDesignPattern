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


## 3. 참고사이트
 - 디자인패턴 관련 서적(English) : https://x.coe.phuket.psu.ac.th/warodom/242-320/ebook/9781786467218-ANDROID_DESIGN_PATTERNS_AND_BEST_PRACTICE.pdf
 - 디자인패턴 관련 정리 블로그 : https://jusungpark.tistory.com/category/DesignPattern
 - 안드로이드 디자인 패턴 : http://chuumong.github.io/android/2017/01/16/%EC%95%88%EB%93%9C%EB%A1%9C%EC%9D%B4%EB%93%9C-%EB%94%94%EC%9E%90%EC%9D%B8-%ED%8C%A8%ED%84%B4
 - 안드로이드 디자인 패턴(기계인간 블로그) : https://johngrib.github.io/wiki/builder-pattern/
 - https://medium.com/@programmerr47/singletons-in-android-63ddf972a7e7
 - https://limkydev.tistory.com/category/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%B0%8D/Design_Pattern 