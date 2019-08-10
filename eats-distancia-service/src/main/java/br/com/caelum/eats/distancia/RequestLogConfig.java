package br.com.caelum.eats.distancia;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.CommonsRequestLoggingFilter;

@Configuration
public class RequestLogConfig {

	@Bean
	public CommonsRequestLoggingFilter requestLogginFilter() {
		
		CommonsRequestLoggingFilter loggingFiler = new CommonsRequestLoggingFilter();
		loggingFiler.setIncludeClientInfo(true);
		loggingFiler.setIncludeQueryString(true);
		loggingFiler.setIncludePayload(true);
		
		return loggingFiler;

	}
	
}
