package com.limitsservice.web.rest;
import com.limitsservice.config.Configurations;
import com.limitsservice.config.LimitConfiguration;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@ApiOperation("LIMITS CONFIGURATION API")
@RequestMapping("/api")
public class LimitsConfigurationController
{
    @Autowired
    private Configurations configuration;

    @Value("${test.text.message}")
    private String mess;

//    @GetMapping("/limits")
    @RequestMapping(value = "/limits", method = RequestMethod.GET)
    public LimitConfiguration retriveLimitsFromConfigurations()
    {
        return new LimitConfiguration(configuration.getMaximum(), configuration.getMinimum());
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test(){
        return mess;
    }

}
