# 학점 산출 프로그램

Do it 자바프로그래밍 입문의 최종 프로젝트인 "학점 산출 프로그램" 을 스스로 만드는 것이 목표입니다.



## ✔️ 조건
- 기능 요구사항, 출력 결과만 참고하고 나머지는 모두 설계

## 🚀 기능
1. 5명의 학생들이 수업을 듣는 Good School 학교가 존재

2. 총 과목은 2과목(수학, 국어)이며 각 학생들은 모두 수강함.

3. 컴퓨터 공학과와 국어국문학과가 있으며 과별로 각각 수학과 국어가 필수과목이다.

4. 학점을 부여하는 정책은 필수과목(S-F)과 일반과목(A-F)이 서로 다르다.

* 향후 <과목이 추가>되거나 <평가정책이 바뀌어도> 손쉽게 유지보수할 수 있는 프로그램 제작이 목표 (학생이 추가될수도 있지 않나..?)

 
## ✍🏻 과목 결과 리포트
![image](https://user-images.githubusercontent.com/65710954/196610522-b23d61ab-0912-401b-a852-507576e03fd6.png)


## 📝 구현 후 피드백
### 추가사항
- 네이버 JAVA 코딩 컨벤션 적용하기 (10/21 완료)
- 방송댄스 과목추가, P/F 방식의 성적산출 방식 추가 (10/21 완료) <br/>
 성적 산출 부분이 애매함 : 학생 전공에 따른 성적 산출 방법은 교수가 정하는 것이 아닌데 P/F 방식은 교수가 정하는것임 <br/>
 교수가 정할수 있게 과목에 P/F인지 일반성적 산출 방식인지 정하게 하자
- 클래스 간 구조 괜찮은지 피드백 받기
- SOLID, 객체지향 생활체조 적용하기

### 이랬으면 좋았겠다
- 학생 클래스에 전공 대신 필수과목을 멤버변수로 사용
- Subject 클래스에 학점 평가정책이 들어간다면?
- 학교 객체를 싱글톤 패턴으로 구현하면 어떨까

