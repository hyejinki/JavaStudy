# HTTP 상태코드

## 4xx - 클라이언트 오류

• 클라이언트의 요청에 잘못된 문법등으로 서버가 요청을 수행할 수 없음

• __오류의 원인이 클라이언트에 있음__

• 중요! 클라이언트가 이미 잘못된 요청, 데이터를 보내고 있기 때문에 똑같은 재시도가 실패함

### 400 Bad Request
 __클라이언트가 잘못된 요청을 해서 서버가 요청을 처리할 수 없음__

• 요청 구문, 메시지 등등 오류

• 클라이언트는 요청 내용을 다시 검토하고, 보내야함

• 예) 요청 파라미터가 잘못되거나, API 스펙이 맞지 않을 때

### 401 Unauthorized
__클라이언트가 해당 리소스에 대한 인증이 필요함__

• 인증(Authentication) 되지 않음

• 401 오류 발생시 응답에 WWW-Authenticate 헤더와 함께 인증 방법을 설명

• 참고
    
    • 인증 (Authentication) : 본인이 누구인지 확인, (로그인)

    • 인가 (Authorization) : 권한부여 (ADMIN 권한처럼 특정 리소스에 접근할 수 있는 권한, 인증이 잇어야 인가가 있음)

    • 오류 메시지가 Unauthorized이지만 인증 되지 않음


### 403 Forbidden
__서버가 요청을 이해했지만 승인을 거부함__

• 주로 인증 자격 즉명은 있지만, 접근 권한이 불충분한 경우

• 예) 어드민 등급이 아닌 사용자가 로그인은 했지만, 어드민 등급의 리소스에 접근하는 경우


### 404 Not Found
__요청 리소스를 찾을 수 없음__

• 요청 리소스가 서버에 없음

• 또는 클라이언트가 권한이 부족한 리소스에 접근할 때 해당 리소스를 숨기고 싶을 때



## 5xx (Server Error)
__서버 오류__

• 서버 문제로 오류 발생

• 서버에 문제가 있기 때문에 재시도 하면 성공할 수 있음(복구가 되거나 등등)    


### 500 Service Unavailable
__서비스 이용 불가__

• 서버가 일시적인 과부하 또는 예정된 작업으로 잠시 요청을 처리할 수 없음

• Retry-After 헤더 필드로 얼마뒤에 복구되는지 보낼 수도 있음

