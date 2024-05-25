import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MedicationRequestTest {

    @Test
    public void testMedicationRequestConstructorAndGetters() {
        String medicationName = "Paracetamol";
        int requiredDose = 500;

        MedicationRequest request = new MedicationRequest(medicationName, requiredDose);

        assertEquals(medicationName, request.getMedicationName(), "Medication name should match");
        assertEquals(requiredDose, request.getRequiredDose(), "Required dose should match");
    }

    @Test
    public void testMedicationRequestWithDifferentValues() {
        String medicationName = "Ibuprofen";
        int requiredDose = 200;

        MedicationRequest request = new MedicationRequest(medicationName, requiredDose);

        assertEquals(medicationName, request.getMedicationName(), "Medication name should match");
        assertEquals(requiredDose, request.getRequiredDose(), "Required dose should match");
    }
}
