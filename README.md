# Tour Routes Ideas Platform
---
Tour Routes Ideas Platform은 사용자에게 맞춤형 여행 스케줄 관리 서비스를 제공하는 웹 애플리케이션입니다.
사용자는 여행 견적을 신청하고, 개별 여행 일정을 관리할 수 있습니다.

## 설치 방법

### 필요한 의존성
- Java JDK 17
- Spring Boot 3.3.4
- MyBatis, Redis
- Lombok, Spring Security, Thymeleaf 추가 지원

### 설치 절차
```bash
git clone https://github.com/yourusername/TourRoutesIdeasPlatform.git
cd TourRoutesIdeasPlatform
./gradlew bootRun
```

## 필요한 의존성
- Java JDK 17
- Spring Boot 3.3.4
- MyBatis, Redis
- Lombok, Spring Security, Thymeleaf 추가 지원

## 사용 방법
서버가 실행된 후, 웹 브라우저에서 http://localhost:8080을 통해 애플리케이션에 접근할 수 있습니다.

## 주요 기능
- 세션 관리: Spring Security와 Thymeleaf를 통한 로그인 세션 관리.
- 데이터 캐싱: Redis를 활용하여 데이터 쿼리 성능 최적화.
- 데이터 매핑: MyBatis를 사용하여 복잡한 데이터베이스 연산을 효율적으로 처리.

## 사용자 가이드
- 고객 로그인: 고객은 이름과 휴대폰 번호를 입력하여 로그인할 수 있습니다.
- 여행 견적 신청: 로그인한 고객은 여행 기간, 이동 수단, 여행 경비 및 여행지를 선택하여 여행 견적을 신청할 수 있습니다.
- 여행 일정 관리: 관리자는 고객의 여행 일정을 관리할 수 있으며, 고객은 등록된 여행 일정을 확인하고 수정 요청을 할 수 있습니다.

## 테스트 환경 설정
프로젝트는 embedded-redis를 포함하여 모든 테스트를 로컬에서 수행할 수 있도록 구성되어 있습니다.

## 기여 방법
GitHub에서 이 프로젝트를 포크하여 자유롭게 기능을 추가하고 풀 리퀘스트를 보낼 수 있습니다.

## 라이선스
이 프로젝트는 MIT 라이선스 하에 배포됩니다.


---

# 프로젝트의 상태
이 프로젝트는 현재 활발히 개발 중이며, 추가 기능 개발과 기존 기능의 개선을 계획하고 있습니다.