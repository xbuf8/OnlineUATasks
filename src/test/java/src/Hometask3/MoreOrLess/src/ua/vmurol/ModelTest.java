package src.Hometask3.MoreOrLess.src.ua.vmurol;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ModelTest {

    @Test
    public void setSecretValue() {
        Model model = new Model();
        int test = model.getSecretValue();
        model.setPrimaryBarrier(0,100);
        model.setSecretValue();
        Assert.assertNotEquals(test,model.getSecretValue());
    }

    @Test
    public void checkValue() {
        Model model = new Model();
        model.setPrimaryBarrier(0,100);
        model.setSecretValue();
        int guess = model.getSecretValue();
        if (model.getSecretValue() != guess){
            Assert.assertFalse(model.getSecretValue() == guess);
        } else{
            Assert.assertTrue(model.getSecretValue() == guess);
        }
    }

    @Test
    public void setPrimaryBarrier() {
        Model model = new Model();
        model.setPrimaryBarrier(0,100);
        Assert.assertEquals(0, model.getMinBarrier());
        Assert.assertEquals(100, model.getMaxBarrier());
    }

}