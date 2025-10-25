package com.mytests.spring.springapiversioningproperties;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.servlet.config.annotation.ApiVersionConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//@Configuration
public class VersioningConfig implements WebMvcConfigurer {

	@Override
	public void configureApiVersioning(ApiVersionConfigurer configurer) {
		//configurer.useMediaTypeParameter(MediaType.APPLICATION_JSON, "mediatype-version");
		//configurer.useRequestHeader("My-Version");
		//configurer.useQueryParam("version-param");
		//configurer.setVersionRequired(false);
		//configurer.addSupportedVersions("1.1", "1.2");
		//configurer.detectSupportedVersions(false);
	}


}