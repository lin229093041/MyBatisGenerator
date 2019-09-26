import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.api.ShellCallback;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.InvalidConfigurationException;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class GeneratorSqlMap {
    public void generator() throws IOException, XMLParserException, InvalidConfigurationException, SQLException, InterruptedException {
        List<String> warnings=new ArrayList<>();
        boolean overwrite =true;
//        加载配置文件
        File file=new File("config/generatorConfig.xml");
//       配置解析类
        ConfigurationParser cp=new ConfigurationParser(warnings);
//      通过解析类和配置文件对象来获取config对象
        Configuration config=cp.parseConfiguration(file);
//        负责处理重复文件的对象
        ShellCallback sc=new DefaultShellCallback(overwrite);
//        创建逆向工程对象
        MyBatisGenerator mbg=new MyBatisGenerator(config,sc,warnings);
//        执行逆向工程
        mbg.generate(null);
    }

    public static void main(String[] args) {
        try {
            new GeneratorSqlMap().generator();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XMLParserException e) {
            e.printStackTrace();
        } catch (InvalidConfigurationException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
