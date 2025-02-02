package systemFile;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.IOException;

import org.junit.jupiter.api.Test;

import circularOrbit.StellarSystem;
import myException.FileChooseException;

class StellarSystemFileTest {

    /**
     * 恒星label错误
     */
    @Test void lableTest() throws IOException {
        File file = new File("src/TestFile/StellarSystemFile/LabelTest.txt");
        StellarSystem stellarSystem = new StellarSystem();
        try {
            stellarSystem.readFileAndCreateSystem(file);
            assertTrue(false, "此处不可达");
        } catch (FileChooseException e) {
            assertEquals(e.getClass(), new FileChooseException().getClass());
        }
    }

    /**
     * 科学记数法表示错误
     */
    @Test void e_notationTest() throws IOException {
        File file = new File("src/TestFile/StellarSystemFile/E_NotationTest.txt");
        StellarSystem stellarSystem = new StellarSystem();
        try {
            stellarSystem.readFileAndCreateSystem(file);
            assertTrue(false, "此处不可达");
        } catch (FileChooseException e) {
            assertEquals(e.getClass(), new FileChooseException().getClass());
        }
    }
    
    /**
     * 测试公转方向错误
     */
    @Test void revolutionDirectionTest() throws IOException {
        File file = new File("src/TestFile/StellarSystemFile/RevolutionDirectionTest.txt");
        StellarSystem stellarSystem = new StellarSystem();
        try {
            stellarSystem.readFileAndCreateSystem(file);
            assertTrue(false, "此处不可达");
        } catch (FileChooseException e) {
            assertEquals(e.getClass(), new FileChooseException().getClass());
        }
    }
    
    /**
     * 测试初始角度错误
     */
    @Test void angelTest() throws IOException {
        File file = new File("src/TestFile/StellarSystemFile/AngelTest.txt");
        StellarSystem stellarSystem = new StellarSystem();
        try {
            stellarSystem.readFileAndCreateSystem(file);
            assertTrue(false, "此处不可达");
        } catch (FileChooseException e) {
            assertEquals(e.getClass(), new FileChooseException().getClass());
        }
    }
    
    /**
     * 测试存在标签相同即星体名字相同的元素
     */
    @Test void labelSameTest() throws IOException {
        File file = new File("src/TestFile/StellarSystemFile/LabelSameTest.txt");
        StellarSystem stellarSystem = new StellarSystem();
        try {
            stellarSystem.readFileAndCreateSystem(file);
            assertTrue(false, "此处不可达");
        } catch (FileChooseException e) {
            assertEquals(e.getClass(), new FileChooseException().getClass());
        }
    }
    
    /**
     * 测试中心恒星缺失
     */
    @Test void noStellarTest() throws IOException {
        File file = new File("src/TestFile/StellarSystemFile/NoStellarTest.txt");
        StellarSystem stellarSystem = new StellarSystem();
        try {
            stellarSystem.readFileAndCreateSystem(file);
            assertTrue(false, "此处不可达");
        } catch (FileChooseException e) {
            assertEquals(e.getClass(), new FileChooseException().getClass());
        }
    }
    
    /**
     * 测试一个轨道上有多个行星
     */
    @Test void mutiTrackObjectTest() throws IOException {
        File file = new File("src/TestFile/StellarSystemFile/MutiTrackObjectTest.txt");
        StellarSystem stellarSystem = new StellarSystem();
        try {
            stellarSystem.readFileAndCreateSystem(file);
            assertTrue(false, "此处不可达");
        } catch (FileChooseException e) {
            assertEquals(e.getClass(), new FileChooseException().getClass());
        }
    }
    
    /**
     * 测试第i层轨道与第i-1层轨道之差小于等于其上行星半径之和
     */
    @Test void trackRadiusTest() throws IOException {
        File file = new File("src/TestFile/StellarSystemFile/TrackRaidusTest.txt");
        StellarSystem stellarSystem = new StellarSystem();
        try {
            stellarSystem.readFileAndCreateSystem(file);
            assertTrue(false, "此处不可达");
        } catch (FileChooseException e) {
            assertEquals(e.getClass(), new FileChooseException().getClass());
        }
    }

}
