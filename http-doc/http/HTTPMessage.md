#HTTP (5)

### HTTP 메세지 구조
    sart-line 시작 라인
    ---------------------
    header 헤더
    ---------------------
    empty line 공백 라인(CRLF)
    ---------------------
    message body

### 시작 라인
__요청 메세지__

    • start-line = request-line / status-line
    
    • request-line = method SP(공백) request-target SP(공백) HTTP-version CRLF(엔터)
    
    • HTTP메서드 (GET / POST / PUT / DELETE...)
    
    • HTTP Version


__응답 메세지__

    • start-line = request-line / status-line
    
    • status-line = HTTP-version SP status-code SP reson-phrase CRLF
    
    • HTTP 버전
    • HTTP 상태 코드 : 요청 성공, 실패를 나타냄
        • 200 : 성공
        • 400 : 클라이언트 요청 오류
        • 500 : 서버 내부 오류
    • 이유 문구 : 사람이 이해할 수 있는 짧은 사애 코드 설명 글
