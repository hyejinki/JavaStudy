# URI와 웹 브라우저 요청 흐름

### URI (Uniform Resource Identifier)

URI?  URL?  URN?

"URI는 로케이터(locator), 이름(name) 또는 둘 다 추가로 분류될 수 있다"

URI - Resource Identifier

URL - Resource Locator

URN - Resource Name


### URI 단어뜻
    Uniform : 리소스 식별하는 통힐된 방식
    
    Resource : 자원, URI로 식별할 수 있는 모든 것(제한 없음)

    Identifier : 다른 항목과 구분하는데 필요한 정보

### URL, URN 단어뜻
    URL - Locator : 리소스가 있는 위치를 지정
    
    URN - Name : 리소스에 이름을 부여

    위치는 변할 수 있지만, 이름은 변하지 않는다

    urn:isbn:8960777331 (어떤 책의 isbn URN)

    URN 이름만으로 실제 리소스를 찾을 수 있는 방법이 아직 보편화 되지 않음



### URL 전체 문법

- scheme://[userinfo@]host[:port][/path][?query][#fragment]
- https://www.google.com:443/search?q=hello&hl=ko

    프로토콜(https)

    호스트명(www.google.com)

    포트번호(443)

    패스(/search)

    쿼리 파라미터(q=hello&hl=ko)



__scheme__://[userinfo@]host[:port][/path][?query][#fragment]
__https__://www.google.com:443/search?q=hello&hl=ko


    주로 프로토콜 사용
    
    프로트콜 : 어떤 방식으로 자원에 접근할 것인가 하는 약속 규칙
        - 예) http, https, ftp 등등
    
    http는 80포트, https는 443 포트를 주로 사용, 포트는 생략 가능
    
    https는 http에 보안 추가(HTTP Secure)


__userinfo__

    URL에 사용자 정보를 포함에서 인증
    
    거의 사용하지 않음



__host__ => www.google.com

scheme://[userinfo@]__host__[:port][/path][?query][#fragment]
https://__www.google.com__:443/search?q=hello&hl=ko

    호스트명
    
    도메인명 또는 IP주소를 직접 사용가능

__PORT__ => __443__

scheme://[userinfo@]host[__:port__][/path][?query][#fragment]
https://www.google.com:__443__/search?q=hello&hl=ko


    포트(PORT)
    
    접속 포트

    일반적으로 생략, 생략시 http는 80, https는 443



__path__ => __search__

scheme://[userinfo@]host[:port][__/path__][?query][#fragment]
https://www.google.com:443/__search__?q=hello&hl=ko


    리소스 경로(path), 계층적 구조
    예)
        /home/file1.jpg
        /members
        /members/100, /items/iphone12


__query__ => __?q=hello&hl=ko__
scheme://[userinfo@]host[:port][/path][__?query__][#fragment]
https://www.google.com:443/search__?q=hello&hl=ko__

    key=value 형태

    ?로 시작, &로 추가 가능 ?keyA=value&keyB=vlaueB

    query parameter, query string 등으로 불림, 웹서비스에 제공하는 파라미터, 문자 형태
    

__fragment__ 

scheme://[userinfo@]host[:port][/path][?query][__#fragment__]
https://docs.spring.io/spring-boot/docs/current/reference/html/getting-started.html__#getting-started.introducing-spring-boot__

    fragment
    
    html 내부 북마크 등에 사용

    서버에 전송하는 정보 아님


