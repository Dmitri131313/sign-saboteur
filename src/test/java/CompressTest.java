import burp.api.montoya.core.ByteArray;
import one.d4d.sessionless.utils.Utils;
import org.junit.jupiter.api.Test;

import java.nio.charset.StandardCharsets;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class CompressTest {
    @Test
    void Base64EncodedTimestampTest() {
        try {
            String expectedValue = ".eJxTKkstqlSgIpGTn5eukJyfV5KaV6IEAJM1I3A";
            byte[] decArray = Utils.base64Decompress(expectedValue.getBytes());
            String realValue = Utils.compressBase64(decArray);
            assertArrayEquals(expectedValue.toCharArray(), realValue.toCharArray());
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }
}
