package za.ac.cput.elective.service;
import java.util.UUID;

public class IDGenerator
{
    public static String generateId()
    {
        return UUID.randomUUID().toString();
    }

}

