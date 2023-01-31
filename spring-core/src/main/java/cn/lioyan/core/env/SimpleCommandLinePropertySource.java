package cn.lioyan.core.env;



/**
 * {@link  org.springframework.core.env.SimpleCommandLinePropertySource} <br>
 * 命令行 属性资产。<br>
 * 其中保存的是{@link org.springframework.core.env.CommandLineArgs} 对象，<br>
 * 将命令行参数解析为 optionArgs k-v 格式，:  例子： --xx=xx。  nonOptionArgs 非k-v格式<br>
 *<br>
 *<br>
 * 对于命令行参数解 解析，是通过{@link org.springframework.core.env.SimpleCommandLineArgsParser} 进行<br>
 *
 */
public class SimpleCommandLinePropertySource {

    public static void main(String[] args) {
        org.springframework.core.env.SimpleCommandLinePropertySource propertySource = new org.springframework.core.env.SimpleCommandLinePropertySource(
                "--name=liyan",
                "--age=1",
                "--age=2",
                "--age=3",
                "lalalatest"
        );
        System.out.println(propertySource.getProperty("age"));
    }
}
