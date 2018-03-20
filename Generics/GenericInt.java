
public interface GenericInt <T>
{
    
}

class One implements GenericInt<String> {
}

class Two<T> implements GenericInt<T> {
}

class Three implements GenericInt {
}
