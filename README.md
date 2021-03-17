# 숫자 야구 게임
* 요구사항   
  * 프로그램이 1 ~ 9 까지의 임의의 숫 3개를 정하고,         
    플레이어가 맞추는 게임이다.        
  
  * 정답을 맞추기 위해 3자리수를 입력하고 힌트를 받는다.      
  
  * 힌트는 야구 용어인 strike, ball 로 표현한다.         
  
  * 같은 자리, 같은 숫자라면 `strike`,          
    다른 자리, 같은 숫자라면 `ball`,       
    같은게 없다면 `nothing` 이다.    
  
  * 입력한 숫자와 임의의 숫자가 같다면 게임 종료   
  
  * 게임 종료 후 다시 시작하거나 완전히 종료할 수 있다   
***
* 프로그래밍 요구사항    
  - 자바 코드 컨벤션을 지키면서 프로그래밍한다.
  - 기본적으로 [Google Java Style Guide](https://google.github.io/styleguide/javaguide.html)을 원칙으로 한다.
  - 단, 들여쓰기는 '2 spaces'가 아닌 '4 spaces'로 한다.
  - indent(인덴트, 들여쓰기) depth를 3이 넘지 않도록 구현한다. 2까지만 허용한다.
  - 예를 들어 while문 안에 if문이 있으면 들여쓰기는 2이다.
  - 힌트: indent(인덴트, 들여쓰기) depth를 줄이는 좋은 방법은   
    함수(또는 메소드)를 분리하면 된다.
  - 함수(또는 메소드)가 한 가지 일만 하도록 최대한 작게 만들어라.
  - 각종 이름을 명확하게 표기하라.   
  - 기능을 객체의 역할과 책임에 맞게 분배하고, 협력을 통해 구현하라.     
***
* 인게임 화면    
 
![야구게임](https://user-images.githubusercontent.com/60066223/111429856-e8e45e00-873c-11eb-8e96-4e2f303e4be7.PNG)          


* 패키지 구조   

![야구게임 패키지 구조](https://user-images.githubusercontent.com/60066223/111430074-352f9e00-873d-11eb-857b-76f47914728a.PNG)


* 객체 관계도        

![야구게임 객체 관계도](https://user-images.githubusercontent.com/60066223/111429840-dff38c80-873c-11eb-85b6-c668a9de6d5f.PNG)         


* 객체의 역할, 책임, 메세지를 중심으로 설계하고 구현해 봤습니다.      
  * 처음 `Application` 클래스의 요청으로 메인메서드에서 게임이 시작됩니다.    
  
  ![application 메세지](https://user-images.githubusercontent.com/60066223/111430286-7f188400-873d-11eb-8acd-3e49296f2e94.PNG)      
  
  
  
  
  1. 요청에 응답하기 위해 `GameController`는 `Number class`를 생성하고,        
     `play()` 를 호출합니다.        
     
    ![gameController](https://user-images.githubusercontent.com/60066223/111431409-19c59280-873f-11eb-8365-d3d36e690f97.PNG)

     
  
  
  2. `play()` 메서드에서는 `Input` 참조변수를 통해 사용자의 입력값을 요청하고,       
     그 값을 `Number` 참조변수를 통해 값을 비교하도록 합니다.               
     
    ![number class compare](https://user-images.githubusercontent.com/60066223/111431516-3bbf1500-873f-11eb-87c7-f5508d43b47c.PNG)      


  
  
  3. 그렇게 비교로 생성 된 인스턴스를 `ScoreBoard` 참조변수가 참조하게 합니다.            
     그 후 `while()` 문에서 `scoreBoard.printScore()` 를 통해 비교된 결과값을 출력하고,        
     게임의 진행 여부를 반환합니다.   
     
    ![gameController](https://user-images.githubusercontent.com/60066223/111431600-542f2f80-873f-11eb-9857-0460e194d9d7.PNG)     
    
     
   
   
   4. 만약 값이 `true` 라면 계속 진행되고, `false` 이면 마지막 질문을 출력합니다.          

    ![ScoreBoard](https://user-images.githubusercontent.com/60066223/111431784-8fc9f980-873f-11eb-8c45-722bb5b521c3.PNG)      

   
  
  
  5. 마지막 질문에서 다시 하기를 선택 하면 `play()` 의 반환값이 `true`가 되면서        
      새로운 랜덤값이 생성되면서 게임이 시작 됩니다.          
      
      ![finishQ](https://user-images.githubusercontent.com/60066223/111431952-c142c500-873f-11eb-87b5-938220a182ca.PNG)     

      
   
   
   6. 종료를 누르면 프로그램이 종료 됩니다.     
***
## 느낀점    
* 객체지향 사실과 오해(일명 토기책)를 읽고 내용을 잊기 전 중요한 개념만   
  착안해 정말 간단한 프로그램을 하나 만들어 봤습니다.    
  객체지향에서 중심은 객체가 가지는 역할과 책임이며,    
  메세지로 협력을 한다. 라는 하나의 문장만을 지키고자 노력했습니다.    

* 확실히 이전에 하나의 클래스에서 메서드만 쪼개 만들었을 때 보다 배는 힘들었습니다.     
  하지만 먼저 요구사항과 기능을 구현하고,    
  기능을 메세지로 만든 뒤, 이 메세지를 누가, 누구에게 요청할 것인지를 중심에 두고,   
  구현이 막힐 때 마다 다시 설계로 돌아와 메세지와 협력을 명확히 했습니다.    
  
* 끊임 없이 잘하고 있는건가, 이게 맞는건가라는 생각이 들었고,    
  코드는 왜이렇게 더럽고 알아보기 힘든거지 라는 생각이 들었습니다.   
  하지만 "정답을 찾는 건 성장을 더디게 할 수도 있다" 라는 말을 떠올리며     
  다른 사람과 비교하지 않으려 노력했습니다.   
  
* 정말 작고 보잘것 없는 프로그램이지만 생각한 시간들이 가치있었기에    
  앞으로 조급함을 떨쳐내고 하나씩 해 볼 수 있을 거 같습니다.    
