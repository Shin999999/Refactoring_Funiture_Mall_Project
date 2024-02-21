# Refactoring_Funiture_Mall_Project
가구 쇼핑몰 웹 개발 팀 프로젝트 (리팩토링 2024.02 ~ )

**리팩토링 목표**
- 사용자 이메일 인증, 회원가입 구현
- 결제 기능 구현
- 찜하기 기능 구현
- 쿠폰 기능 구현
- 장바구니 분리, 리뷰 분리 구현

**1.1v (2024.02~2024.02)**
- 엔티티 연관관계 부여
- 조회 쿼리 최적화 (페이징)
- Controller 상태코드 변경
- 테스트 코드 리팩토링 (통합 테스트 위주)

**1.2v (2024.03 ~)**
- API 문서 작성
- 통합테스트 리팩토링, 단위테스트
- S3를 이용해서 파일업로드 하기
- Security 리팩토링
- HATEOAS 도입
- Commit 컨벤션 정하기.

# Furniture_Mall_Project
![image](https://github.com/shsh99/Furniture_Mall_Project/assets/134079624/e345ed1e-88a5-473d-8a52-389513e7d75a)



## 가구 쇼핑몰 웹 개발 팀 프로젝트 

<br>

## 🚀 프로젝트 개요
- ***모든 팀원이 풀스택으로 개발에 참여했으며, 주 포지션은 아래와 같습니다.***

- **참여 
신동구, 도권재**

- **프로젝트 리팩토링 기간 2024.02.21 ~ 2024.03.**

- **프로젝트 기간 : 2023년 11월 15일 ~ 2023년 12월 03일**


<br>

## 🎮 기술 스택

### ✨ Front-End

<details>
    <summary>⚡️ FE 자세히 살펴보기</summary>
    <br>
    <ul>
        <li>bootstrap : 5.0 </li>
        <li>HTML5 </li>
        <li>CSS3 </li>
        <li>JavaScript </li>
        <li>TypeScript </li>
        <li>React </li>
        <li>axios </li>
        <li>nodeModules </li>
        
       
    </ul>
</details>

  <br>

### 💻 Back-End

<details>
      <summary>⚡️ BE 자세히 살펴보기</summary>
      <br>
      <ul>
          <li>springboot : 2.7.17  </li>
          <li>Oracle SQL : </li>
          <li>jdk : 11.0.20  </li>
          <li>java : 11  </li>
          <li>lombok </li>
          <li>Oracle DB </li> 
          <li>JPA </li>
          <li>lombok </li>
          <li>javax </li>
          
      </ul>
  </details>
  
  <br>
  
### 🛠 외부 API

<details>
      <summary>⚡️ API 자세히 살펴보기</summary>
      <br>
      <ul>
          <li>카카오페이 API</li>  
          <li>DAUM 우편번호 찾기 API</li>       
      </ul>
</details>

  <br>


### 🙌🏻 Collaboration
<img src="https://img.shields.io/badge/JavaScript-F7DF1E?style=flat&logo=Jira&logoColor=white"/> <img src="https://img.shields.io/badge/SpringBoot-6DB33F?style=flat&logo=Slack&logoColor=white"/> <img src="https://img.shields.io/badge/Github-181717?style=flat&logo=Github&logoColor=white"/> <img src="https://img.shields.io/badge/SQL-4479A1?style=flat&logo=Notion&logoColor=white"/> <img 
src="https://img.shields.io/badge/CSS3-1572B6?style=flat&logo=Notion&logoColor=white"/> <img src="https://img.shields.io/badge/HTML5-E34F26?style=flat&logo=Notion&logoColor=white"/>
<img src="https://img.shields.io/badge/Docker-2496ED?style=flat-square&logo=Docker&logoColor=white"/>
<img src="https://img.shields.io/badge/Google Cloud-4285F4?style=flat-square&logo=Google Cloud&logoColor=white"/>
<img src="https://img.shields.io/badge/java-007396?style=flat-square&logo=java&logoColor=white"/>
<img src="https://img.shields.io/badge/ORACLE-F80000?style=flat-square&logo=oracle&logoColor=white"/>
<img src="https://img.shields.io/badge/Typescript-3178C6?style=flat-square&logo=Typescript&logoColor=white"/>
<img src="https://img.shields.io/badge/React-61DAFB?style=flat-square&logo=React&logoColor=black"/>

<br>

## ⚙ 의존성
implementation 'org.apache.tomcat.embed:tomcat-embed-jasper'
implementation 'javax.servlet:jstl'
implementation 'org.springframework.boot:spring-boot-starter-aop'
implementation 'org.springframework.boot:spring-boot-starter-validation'
implementation 'org.springframework.boot:spring-boot-starter-web'
implementation 'org.springframework.security:spring-security-crypto'
compileOnly 'org.projectlombok:lombok'
developmentOnly 'org.springframework.boot:spring-boot-devtools'
implementation 'org.mybatis.spring.boot:mybatis-spring-boot-starter:2.3.0'
runtimeOnly 'com.mysql:mysql-connector-j'
annotationProcessor 'org.projectlombok:lombok'
testImplementation 'org.springframework.boot:spring-boot-starter-test'
implementation 'org.springframework.boot:spring-boot-starter-mail'
implementation 'org.springframework:spring-context-support'
implementation group: 'net.nurigo', name: 'javaSDK', version: '2.2'
implementation 'commons-io:commons-io:2.6'
implementation 'com.google.code.gson:gson:2.8.6'
implementation 'commons-fileupload:commons-fileupload:1.3.1'
```


## 1️⃣ 프로젝트 구조

<details>
    <summary>⚡️ 구조 자세히 살펴보기</summary>
 📦src
     ┗ 📂main
       ┣ 📂java
       ┃ ┗ 📂com
       ┃   ┗ 📂project
       ┃     ┗ 📂ecofurniture
       ┃       ┃ ┣ 📂config
       ┃       ┃ ┗ 📂controller
       ┃       ┃  ┗ 📂admin
       ┃       ┃ ┃  ┗ 📂code
       ┃       ┃ ┃  ┗ 📂coupon
       ┃       ┃ ┗ 📂auth
       ┃       ┣ 📂dto
       ┃       ┃ ┣ 📂kakao
       ┃       ┃ ┣ 📂nation
       ┃       ┃ ┣ 📂request
       ┃       ┃ ┗ 📂response
       ┃       ┣ 📂enums
       ┃       ┣ 📂handler
       ┃       ┃ ┗ 📂exception
       ┃       ┣ 📂repository
       ┃       ┃ ┣ 📂interfaces
       ┃       ┃ ┗ 📂model
       ┃       ┣ 📂service
       ┃       ┗ 📂utils
       ┣ 📂resources
       ┃ ┣ 📂static
       ┃ ┣ 📂templates
   

</details>

<br>

## 2️⃣ 프로젝트 개요
- 배운것을 최대한 활용할 수 있는 주제를 고르다가 쇼핑몰 웹 사이트를 구현하면 배운 기술들을 모두 활용할 수 있을 것 같아서 주제로 선정
- 

<br>

## 3️⃣ 기능 구분

#### 고객 페이지

#### 관리자 페이지

#### 공통 페이지

- 대충 이런식으로 진행될 것 입니다- 대충 이런식으로 진행될 것 입니다


<br>

## 4️⃣ ERD & 테이블 명세서
#### 테이블 명세서 : https://docs.google.com/spreadsheets/d/1zpjjtAKGhq-PrGZjYdW3FrDrXBLRjHzK8iVUpqgpsR0/edit?usp=sharing

![image](https://github.com/shsh99/Furniture_Mall_Project/assets/134079624/993b9038-335d-465f-b4d3-aeaf0915e5b9)


<br>

## 5️⃣ SiteMap & WireFrame

#### 사이트 맵
<table>
<tr>
 <td> <b>고객</b></td>
 <td> <b>매니저</b></td>
 </tr>
<tr>
<td><img src="https://github.com/shsh99/Furniture_Mall_Project/assets/134079624/7fa1b7e8-92e9-4b48-a465-645e02d84e1c"
        ></td>
<td><img src="https://github.com/shsh99/Furniture_Mall_Project/assets/134079624/d8a42127-feed-4696-a252-ccb1661669b1"
></td>
</tr>
</table>

#### 와이어 프레임
#### 사이트 맵
<table>
<tr>
 <td> <b></b></td>
 <td> <b></b></td>
 </tr>
<tr>
<td></td>
<td></td>
</tr>
</table>

<br>

## 6️⃣ 주요 기능

<br>

## 7️⃣ 기능 - 고객

#### 회원가입
- 아이디 중복 확인
- 비밀번호 확인
- Validation(시스템 검증) 처리
- 주소 찾기 (DAUM 우편번호 찾기 API)

#### 로그인
- 카카오 소셜 로그인 (OAuth 2.0 프로토콜)
- 일반 로그인
- 아이디/비밀번호 찾기 (이메일 SMTP 프로토콜)

#### 고객 정보
- 고객 정보 조회
- 고객 정보 변경 (주소, 휴대폰 번호)
- 비밀번호 변경
- 회원탈퇴

#### 포인트 조회
- 포인트 전체 조회 (사용내역, 잔여 포인트)

#### 쿠폰 조회
- 쿠폰 전체 조회(사용 가능 쿠폰, 사용 내역, 사용한 쿠폰)

#### 상품 조회
- 검색창 상품 이름 조회
- 상품 상세조회

#### 찜 기능
- 상품 상세조회에서 마음에 드는 상품 찜 기능

#### 베스트 기능
- 찜이 많은 순으로 베스트 아이템 등록

#### 장바구니 기능
- 장바구니 조회 기능
- 찜 한 상품 장바구니 추가 기능
- 상품 장바구니 추가 기능
- 추가 상품 삭제 기능
- 장바구니 전체 결제, 체크 된 것만 결제 기능

#### 주문내역 조회

#### 상품 문의
- 상품문의 게시판 기능

#### 상품평
- 상품평 게시판 기능
- 구매내역에 있는 상품에만 리뷰 가능 기능

#### 결제 
- 카카오 결제 api

<br>

## 8️⃣ 기능 - 관리자

#### 회원 관리
-

#### 상품 관리
- 상품 CRUD
- 상품 이미지 등록

#### 관리자 게시판
- 공지사항 게시판 crud
- 자주 묻는 질문 게시판 crud
- qna 게시판 (답글, 삭제)
- 상품 문의 (답글, 삭제)

#### 쿠폰 발급
- 쿠폰 CRUD
- 쿠폰 발급
