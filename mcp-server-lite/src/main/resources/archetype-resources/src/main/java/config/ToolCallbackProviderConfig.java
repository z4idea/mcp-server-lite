package cn.z4idea.mcp.server.computer.config;

import cn.z4idea.mcp.server.computer.domain.service.XxxService;
import org.springframework.ai.tool.ToolCallbackProvider;
import org.springframework.ai.tool.method.MethodToolCallbackProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 27166
 * @date 2025/4/1 14:48
 */

@Configuration
public class ToolCallbackProviderConfig {
    
    @Bean
    public ToolCallbackProvider computerTools(XxxService xxxService) {
        return MethodToolCallbackProvider.builder().toolObjects(xxxService).build();
    }
    
}
