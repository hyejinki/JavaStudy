# HTTP 헤더2 - 캐시와 조건부 요청

## 캐시 무효화

### 확실한 캐시 무효화 응답

• __Cache-Control: no-cache, no-store, must-revalidate__

• __Pragma: no-cache__

    • HTTP 1.0 하위 호환

이렇게 다 넣어야 함

### Cache-Control
__캐시 지시어(directives) - 확실한 캐시 무효화__

• __Cache-Control: no-cache__

    • 데이터는 캐시해도 되지만, 항상 원 서버에 검증하고 사용(이름에 주의!)

• __Cache-Control: no-store__
    
    • 데이터에 민감한 정보가 있으므로 저장하면 안됨 (메모리에서 사용하고 최대한 빨리 삭제)

• __Cache-Control: must-revalidate__

    • 캐시 만료 후 최초 조회시 원 서버에 검증해야함

    • 원 서버 접근 실패시 반드시 오류가 발생해야함 - 504(Gateway Timeout)

    • must-revalidate는 캐시 유효 시간이라면 캐시를 사용함

• Pragma: no-chace

    • HTTP 1.0 하위 호환


