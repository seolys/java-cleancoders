package seol.study.luggageCompartment.pp;

import org.junit.Test;

import static org.junit.Assert.*;

public class LuggageCompartmentTest {
    @Test
    public void 러기지_추가_테스트(){
        LuggageCompartment lc = new LuggageCompartment(2);
        boolean 러기지1 = lc.add("러기지1");
        boolean 러기지2 = lc.add("러기지2");
        boolean 러기지3 = lc.add("러기지3");

        assertTrue(러기지1);
        assertTrue(러기지2);
        assertFalse("사이즈가 꽉차서 추가되지 않는다", 러기지3);
        assertFalse("더이상 추가할 수 없는 상태", lc.canAdd());
        assertEquals(lc.size(), 2);
    }

    @Test
    public void 러기지_제거_테스트(){
        LuggageCompartment lc = new LuggageCompartment(2);
        boolean 러기지1 = lc.add("러기지1");
        boolean 러기지2 = lc.add("러기지2");
        lc.extract("러기지1");

        assertTrue(러기지1);
        assertTrue(러기지2);
        assertTrue("1개가 제거되었기때문에 추가가능", lc.canAdd());
        assertEquals(lc.size(), 1);
    }

    @Test
    public void 러기지_사이즈오류_테스트(){
        int size = 2;
        LuggageCompartment lc = new LuggageCompartment(size);
        boolean 러기지1 = lc.add("러기지1");
        boolean 러기지2 = lc.add("러기지2");
        lc.remove("러기지1");

        assertNotEquals("여유공간이 있지만 채울수 없음.",lc.size() < size, lc.canAdd());
    }

}