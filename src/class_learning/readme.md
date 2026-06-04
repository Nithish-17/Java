| Use Case | What `Class` does | Example | Why useful |
|---|---|---|---|
| Reflection / Inspect class | Gets information about methods, fields, constructors | `Student.class.getDeclaredMethods()` | Inspect class at runtime |
| Get class name | Returns class metadata like name | `Student.class.getName()` | Know runtime class info |
| Get fields | Access class variables/fields | `Student.class.getDeclaredFields()` | Frameworks, debugging, reflection |
| Get methods | Access methods of class | `Student.class.getDeclaredMethods()` | Dynamic method inspection |
| Get constructors | Access constructors | `Student.class.getDeclaredConstructors()` | Dynamic object creation |
| Dynamic object creation | Create object without `new` | `Student.class.getDeclaredConstructor().newInstance()` | Used in frameworks, plugins |
| Runtime type checking | Find object's real runtime type | `obj.getClass()` | Determine actual object type |
| Type comparison | Compare exact class types | `obj.getClass() == String.class` | Type validation |
| Inheritance info | Get parent class | `String.class.getSuperclass()` | Understand hierarchy |
| Interface information | Get implemented interfaces | `ArrayList.class.getInterfaces()` | Runtime inspection |
| Dynamic class loading | Load class using name | `Class.forName("Student")` | JDBC drivers, plugins, frameworks |
| Annotation processing | Read annotations | `Student.class.getAnnotations()` | Used by frameworks |
| Static synchronization | Used as lock for static synchronized methods | `synchronized(Counter.class)` | Thread safety |
| Access modifiers info | Inspect modifiers like `public`, `private`, `final` | `Student.class.getModifiers()` | Reflection/meta-programming |
| Package information | Get package details | `Student.class.getPackage()` | Metadata inspection |
| Check relationships | Check inheritance/interfaces | `Animal.class.isAssignableFrom(Dog.class)` | Type compatibility |
| Generic type information | Inspect generic signatures | Reflection APIs | Framework internals |
| Arrays and component type | Get array element type | `arr.getClass().getComponentType()` | Runtime array handling |

## Quick Memory Version

| Category | Purpose |
|---|---|
| Reflection | Inspect class at runtime |
| Dynamic creation | Create object without `new` |
| Type checking | Know actual object type |
| Metadata | Methods, fields, constructors, annotations |
| Relationships | Parent class, interfaces |
| Synchronization | Lock for static synchronized |
| Frameworks | Used heavily in Spring/Hibernate/JDBC |

### One-Line Summary

```text
Class class = runtime information and control over classes
```