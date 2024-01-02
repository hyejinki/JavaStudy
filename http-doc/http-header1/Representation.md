# HTTP Header 

## 표현 Representation

• Content-Type : 표현 데이터의 형식

• Content-Encoding: 표현 데이터의 압축 방식

• Content-Language: 표현 데이터의 자연 언어

• Content-Length: 표현 데이터의 길이


• 표현 헤더는 전송, 응답 둘 다 사용

### Content-Type
__표현 데이터의 형식 설명__

• 미디어 타입, 문자 인코딩

• 예)

    • text/html; charset=utf-8

    • application/json

    • image/png

### Content-Encoding
__표현 데이터 인코딩__

• 표현 데이터를 압축하기 위해 사용

• 데이터를 전달하는 곳에서 압축 후 인코딩 헤더 추가

• 데이터를 읽는 쪽에서 인코딩 헤더의 정보로 압축 해제

### Content_Language
__표현 데이터의 자연 언어__

• 표현 데이터의 자연 언어를 표현

### Content-Length
__표현 데이터의 길이__

• 바이트 단위

• Transfer-Encoding(전송 코딩)을 사용하면 Content-Length를 사용하면 안됨