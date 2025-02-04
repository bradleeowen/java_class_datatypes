# java_class_datatypes
Repository contains simple java program showing the use of:
1. **Concrete Class**
2. **Abstract Class**
3. **Interface**

### 1. Interface: `SoundMaker`
- Defines the `makeSound()` method, which must be implemented by any class.

### 2. Abstract Class: `Animal`
- Provides a constructor to initialize `name` and a concrete `getName()` method.
- Declares an abstract `eat()` method to be implemented by subclasses.

### 3. Concrete Classes: `Dog` and `Cat`
- Extend `Animal` and implement `SoundMaker`.
- Provide specific implementations for `eat()` and `makeSound()`.

output will be
Buddy is eating dog food.
Buddy says: Woof!
Whiskers is eating cat food.
Whiskers says: Meow!
