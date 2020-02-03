package code401challenges;

import org.junit.Test;

import static org.junit.Assert.*;

public class MultiBracketValidationTest {

    @Test
    public void testArgument1(){
        assertTrue(MultiBracketValidation.multiBracketValidation("{}"));
//        System.out.println(MultiBracketValidation.bracketValidation("{{}}{}"));
    }
    @Test
    public void testArgument2(){
        assertTrue(MultiBracketValidation.multiBracketValidation("{}(){}"));


    }

    @Test
    public void testArgument3(){
        assertTrue(MultiBracketValidation.multiBracketValidation("()[[Extra Characters]]"));

    }

    @Test
    public void testArgument4(){
        assertTrue(MultiBracketValidation.multiBracketValidation("(){}[[]]"));

    }

    @Test
    public void testArgument5(){
        assertTrue(MultiBracketValidation.multiBracketValidation("{}{Code}[Fellows](())"));

    }

    @Test
    public void testArgument7(){
        assertFalse(MultiBracketValidation.multiBracketValidation("(]("));

    }
    @Test
    public void testArgument6(){
        assertFalse(MultiBracketValidation.multiBracketValidation("[({}]"));

    }


    @Test
    public void testArgument8(){
        assertFalse(MultiBracketValidation.multiBracketValidation("{(})}"));

    }

    @Test
    public void testArgument9(){
        assertFalse(MultiBracketValidation.multiBracketValidation("}((((((())))){(})"));

    }

    @Test
    public void testArgument10(){
        assertFalse(MultiBracketValidation.multiBracketValidation("[(([{{[{(})]}"));

    }

    @Test
    public void testArgument14(){
        assertFalse(MultiBracketValidation.multiBracketValidation("}{"));

    }
    @Test
    public void testArgument11(){
        assertFalse(MultiBracketValidation.multiBracketValidation("{"));

    }
    @Test
    public void testArgument12(){
        assertFalse(MultiBracketValidation.multiBracketValidation(")"));

    }

    @Test
    public void testArgument13(){
        assertFalse(MultiBracketValidation.multiBracketValidation("[}"));

    }

}