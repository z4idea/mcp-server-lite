package cn.z4idea.mcp.server.computer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 27166
 * @date 2025/4/1 14:35
 */
@Slf4j
@SpringBootApplication
public class McpServerApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(McpServerApplication.class);
    }
    
    @Override
    public void run(String... args) throws Exception {
        log.info("mcp server success!");    
    }
    
}