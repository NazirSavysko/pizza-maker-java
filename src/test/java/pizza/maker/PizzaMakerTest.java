package pizza.maker;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

public class PizzaMakerTest {

    private static Method method;

    @BeforeAll
    public static void setUp() throws NoSuchMethodException {
        method = PizzaMaker.class.getDeclaredMethod("makePizza");
        method.setAccessible(true);
    }

    @Test
    public void when_choose_american_pizza() throws Throwable {
        // Given
        Field field = PizzaMaker.class.getDeclaredField("SCANNER");
        field.setAccessible(true);
        Scanner testScanner = new Scanner(new ByteArrayInputStream("1\n".getBytes()));
        field.set(null, testScanner);
        PrintStream originalOut = System.out;
        ByteArrayOutputStream outputBuffer = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputBuffer));

         // When
        method.invoke(null);
        System.setOut(originalOut);

            // Then
        String res = outputBuffer.toString();
        assertTrue(res.contains("Baking American pizza"));
    }

    @Test
    public void when_choose_italian_pizza() throws Throwable {
        // Given
        Field field = PizzaMaker.class.getDeclaredField("SCANNER");
        field.setAccessible(true);
        Scanner testScanner = new Scanner(new ByteArrayInputStream("2\n".getBytes()));
        field.set(null, testScanner);
        PrintStream originalOut = System.out;
        ByteArrayOutputStream outputBuffer = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputBuffer));

        // When
        method.invoke(null);
        System.setOut(originalOut);

        // Then
        String res = outputBuffer.toString();
        assertTrue(res.contains("Baking Italian pizza..."));
    }

    @Test
    public void when_choose_Asian_pizza() throws Throwable {
        // Given
        Field field = PizzaMaker.class.getDeclaredField("SCANNER");
        field.setAccessible(true);
        Scanner testScanner = new Scanner(new ByteArrayInputStream("3\n".getBytes()));
        field.set(null, testScanner);
        PrintStream originalOut = System.out;
        ByteArrayOutputStream outputBuffer = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputBuffer));

        // When
        method.invoke(null);
        System.setOut(originalOut);

        // Then
        String res = outputBuffer.toString();
        assertTrue(res.contains("Baking Asian pizza..."));
    }

    @Test
    public void when__invalid_choice() throws Throwable {
        // Given
        Field field = PizzaMaker.class.getDeclaredField("SCANNER");
        field.setAccessible(true);
        Scanner testScanner = new Scanner(new ByteArrayInputStream("6\n".getBytes()));
        field.set(null, testScanner);
        PrintStream originalOut = System.out;
        ByteArrayOutputStream outputBuffer = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputBuffer));

        // When
        method.invoke(null);
        System.setOut(originalOut);

        // Then
        String res = outputBuffer.toString();
        assertTrue(res.contains("An error occurred while making the pizza: Invalid choice"));
    }

}