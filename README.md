Contract to be implemented by plugins to be executed by [PluginPlatform](https://github.com/bytealizer/PluginPlatform)

Example:

```
public class SpanishGreeting implements GreetingPlugin {  
  
    @Override  
  public void greet(String userName) {  
        System.out.println("Hola "+ userName+" "+"bienvenido");  
    }  
  
    @Override  
  public String getLanguage() {  
        return "Spanish";  
    }  
}
```
Note: This is a learning exercise
- Plugin Platform:  https://github.com/bytealizer/PluginPlatform
- Plugin Platform Contracts: https://github.com/bytealizer/PluginPlatformContracts
- Plugin Implementation: https://github.com/bytealizer/SPHNGreeting
