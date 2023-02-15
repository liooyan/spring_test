package cn.lioyan.test;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * {@link TestRest}
 *
 * @author com.lioyan
 * @date 2023/2/1  11:11
 */
@RestController
public class TestRest
{


    @GetMapping("/test")
    public void send()
    {
        System.out.println(1111);

    }
    public void file2(@RequestParam("file1")MultipartFile multipartFile)
    {
        System.out.println(multipartFile.getName());
    }

    @PostMapping("/file")
    public void file(@RequestParam("file1")MultipartFile multipartFile)
    {
        System.out.println(multipartFile.getName());
    }

    @PostMapping("/file/{id}")
    public void file3(@RequestParam("file1")MultipartFile multipartFile, @PathVariable("id") String id)
    {
        System.out.println(multipartFile.getName());
    }

    @Bean
    public CorsFilter corsFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration corsConfiguration = new CorsConfiguration();
        corsConfiguration.addAllowedOrigin(CorsConfiguration.ALL);
        corsConfiguration.addAllowedHeader(CorsConfiguration.ALL);
        corsConfiguration.addAllowedMethod(CorsConfiguration.ALL);
        corsConfiguration.setMaxAge(3600L);
        source.registerCorsConfiguration("/**", corsConfiguration);
        return new CorsFilter(source);
    }
}
