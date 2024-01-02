# HTTP 헤더2 - 캐시와 조건부 요청

## 검증 헤더와 조건부 요청1

### 캐시 시간 초과

• 캐시 유효 시간이 초과해서 서버에 다시 요청하면 두 가지 상황이 나타난다.

    • 서버에서 기존 데이터를 변경함
    
    • 서버에서 기존 데이터를 변경하지 않음
        -> 그럼 이전과 동일한 데이터를 다시 다운로드 해야하나?


• 캐시 만료 후에도 서버에서 데이터를 변경하지 않음

• 생각해보면 데이터를 전송하는 대신에 저장해 두었던 캐시를 재사용할 수 있다.

• 단 클라이언트의 데이터와 서버의 데이터가 같다는 사실을 확인할 수 있는 방법 필요

### 검증 헤더 추가

첫 번째 요청

    • 데이터가 마지막에 수정된 시간도 추가할 수 있다
        예)

        HTTP/1.1 200 OK
        Content-Type: image/jpeg
        cache-control: max-age=60
        Last-Modified: 2020년 11월 10일 10:00:00 (검증 헤더)
        Content-Length: 34012
        lkj123kljoiasudlkjaweioluywlnfdo912u34ljko98udjklasl
        kjdfl;qkawj9;o4ruawsldkal;skdjfa;ow9ejkl3123123

60초 후 두 번째 요청 - 캐시 시간 초과

    •   GET /star.jpg 
        if-modified-since: 2020년 11월 10일 10:00:00 (조건부 요청)
    
데이터 최종 수정일을 비교해보고 데이터가 수정되지 않았다면
    
    HTTP/1.1 304 Not Modified 
    Content-Type: image/jpeg
    cache-control: max-age=60
    Last-Modified: 2020년 11월 10일 10:00:00
    Content-Length: 34012

    !! HTTP Body가 없음
    그래서 빠른 속도로 응답할 수 있는 것임.

### 정리

    • 캐시 유효 시간이 초과해도, 서버의 데이터가 갱신되지 않으면

    • 304 Not Modified + 헤더 메타 정보만 응답(바디x)

    • 클라이언트는 서버가 보낸 응답 헤더 정보로 캐시의 메타 정보를 갱신

    • 클라이언트는 캐시에 저장되어 있는 데이터 재활용

    • 결과적으로 네트워크 다운로드가 발생하지만 용량이 적은 헤더 정보만 다운로드

    • 매우 실용적인 해결책

