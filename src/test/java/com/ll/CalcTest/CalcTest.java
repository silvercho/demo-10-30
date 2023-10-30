package com.ll.CalcTest;

import com.ll.Calc;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalcTest {
    @Test
    @DisplayName("Calc에 run 메서드는 int 를 리턴한다.")
    void t1(){
        int rs = Calc.run("");
    }
}
