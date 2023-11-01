import static org.junit.Assert.*;

import org.junit.Test;

import grpc.test.ServicioGRPC;

public class ClassTest {
    @Test
    public void ClassTest(){// TODO
        ServicioGRPC test= new ServicioGRPC();
        assertNotEquals(null, test);
    }
}
