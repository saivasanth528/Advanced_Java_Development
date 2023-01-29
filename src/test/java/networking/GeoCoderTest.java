package networking;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;
import java.util.Arrays;

import org.junit.Test;

public class GeoCoderTest {
    private GeoCoder geoCoder = new GeoCoder();

    @Test
    public void encodeAddress() {
        String encoded = geoCoder.encodeAddress(
                Arrays.asList("1600 Ampitheatre Parkway", "Mountain View", "CA")
        );
        assertEquals("1600+Ampitheatre+Parkway,Mountain+View,CA", encoded);
    }

    @Test
    public void getData() {
        String data = geoCoder.getData(
                Arrays.asList("1600 Ampitheatre Parkway", "Mountain View", "CA"));
        System.out.println(data);
    }


    @Test
    public void fillInLatLng() {
        Location location = new Location(
                "1600 Ampitheatre Parkway", "Mountain View", "CA");
        geoCoder.fillInLatLng(location);
        assertEquals(location.getLatitude(), 37.4209842197085);
        assertEquals(location.getLongitude(), -122.0852930802915);
    }
}
