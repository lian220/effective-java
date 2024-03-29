package act1.item04;

import org.springframework.util.StringUtils;

// 코드 4-1 인스턴스를 만들 수 없는 유틸리티 클래스 (26~27쪽)
public class UtilityClass {
    // 기본 생성자가 만들어지는 것을 막는다(인스턴스화 방지용).
    // Spring StringUtils 참고
    private UtilityClass() {
        throw new AssertionError();
    }

    // 나머지 코드는 생략
}
