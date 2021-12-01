import javax.swing.*;
import java.awt.*;

/**
 * Project name(项目名称)：Swing单选按钮组件
 * Package(包名): PACKAGE_NAME
 * Class(类名): test
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2021/12/1
 * Time(创建时间)： 10:48
 * Version(版本): 1.0
 * Description(描述)： Swing JRadioButton：单选按钮组件
 * 在同一个 ButtonGroup 按钮组中的单选按钮，只能有一个单选按钮被选中。
 * JRadioButton 类的常用构造方法如下。
 * JRadioButton()：创建一个初始化为未选择的单选按钮，其文本未设定。
 * JRadioButton(Icon icon)：创建一个初始化为未选择的单选按钮，其具有指定的图像但无文本。
 * JRadioButton(Icon icon,boolean selected)：创建一个具有指定图像和选择状态的单选按钮，但无文本。
 * JRadioButton(String text)：创建一个具有指定文本但未选择的单选按钮。
 * JRadioButton(String text,boolean selected)：创建一个具有指定文本和选择状态的单选按钮。
 * JRadioButton(String text,Icon icon)：创建一个具有指定的文本和图像并初始化为未选择的单选按钮。
 * JRadioButton(String text,Icon icon,boolean selected)：创建一个具有指定的文本、图像和选择状态的单选按钮。
 */

public class test
{
    public static void main(String[] args)
    {
        JFrame jFrame = new JFrame("测试");
        jFrame.setLocation(200, 200);
        jFrame.setSize(640, 480);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JPanel jPanel = new JPanel();
        Font font = new Font("宋体", Font.BOLD, 20);
        JLabel label = new JLabel("年龄：");
        label.setFont(font);
        JRadioButton radioButton1 = new JRadioButton("0-12");
        radioButton1.setSelected(true);
        radioButton1.setFont(font);
        JRadioButton radioButton2 = new JRadioButton("12-18");
        JRadioButton radioButton3 = new JRadioButton("18-36");
        JRadioButton radioButton4 = new JRadioButton("36-60");
        JRadioButton radioButton5 = new JRadioButton("60-80");
        JRadioButton radioButton6 = new JRadioButton("80-100");
        radioButton2.setFont(font);
        radioButton3.setFont(font);
        radioButton4.setFont(font);
        radioButton5.setFont(font);
        radioButton6.setFont(font);
        ButtonGroup buttonGroup=new ButtonGroup();
        buttonGroup.add(radioButton1);
        buttonGroup.add(radioButton2);
        buttonGroup.add(radioButton3);
        buttonGroup.add(radioButton4);
        buttonGroup.add(radioButton5);
        buttonGroup.add(radioButton6);
        jPanel.add(label);
        jPanel.add(radioButton1);
        jPanel.add(radioButton2);
        jPanel.add(radioButton3);
        jPanel.add(radioButton4);
        jPanel.add(radioButton5);
        jPanel.add(radioButton6);
        jFrame.add(jPanel);
        jFrame.setVisible(true);

    }
}
