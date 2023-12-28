# HTTP 메서드 활용 (2)

## HTTP API 설계 예시

• HTTP API - 컬렉션

    • POST 기반 등록

    • 예) 회원 관리 API 제공

• HTTP API - 스토어

    • PUT 기반 등록

    • 예) 정적 컨텐츠 관리, 원격 파일 관리

• HTML FORM 사용

    • 웹 페이지 회원 관리

    • GET, POST만 지원


### POST와 PUT의 차이점
__둘 다 등록에 쓰일 수 있는데 다른점이 있음__


    • POST
        • 클라이언트는 등록될 리소스의 URI를 모른다.
        • 서버가 새로 등록된 리소스 URI를 생성해준다.


    • PUT
        • 클라이언트가 리소스 URI를 알고 있어야 한다.
            • 파일 등록 /files/{filename} -> PUT
            • PUT /files/star.jpg

        • 클라이언트가 직접 리소스의 URI를 지정한다.


### 정리

• HTTP API - 컬렉션

    • POST 기반 등록
    
    • 서버가 리소스 URI 결정

• HTTP API - 스토어

    • PUT 기반 등록
    
    • 클라이언트가 리소스 URI 결정

• HTML FORM 사용

    • 순수 HTML + HTML form 사용

    • GET, POST만 지원


__참고하면 좋은 URI 설계 개념__

• 문서(document)

    • 단일 개념(파일 하나, 객체 인스턴스, 데이터베이스 row)
    
    • 예) /members/100, files/star.jpg

• 컬렉션(collection)

    • 서버가 관리하는 리소스 디렉토리

    • 서버가 리소스의 URI를 생성하고 관리

    • 예) /member

• 스토어(store)

    • 클라이언트가 관리하는 자원 저장소

    • 클라이언트가 리소스의 URI를 알고 관리

    • 예) /files

• 컨트롤러(controller), 컨트롤 URI

    • 문서, 컬렉션, 스토어로 해결하기 어려운 추가 프로세스 실행

    • 동사를 직접 사용

    • 예) /members/{id}/delete