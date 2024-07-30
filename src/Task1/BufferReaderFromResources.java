package Task1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Objects;

public class BufferReaderFromResources {
	public static BufferedReader getBufferReader(String filename) {
		return new BufferedReader(new InputStreamReader(Objects.requireNonNull(BufferReaderFromResources.class.getResourceAsStream("/" + filename))));
	}
}
