package bt.sample;

import bt.Contract;
import bt.EmulatorWindow;

/**
 * A contract that simply send a "Hello!" message back.
 * 
 * @author jjos
 *
 */
public class Hello extends Contract {

	@Override
	public void txReceived() {
		sendMessage("Hello!", getCurrentTx().getSenderAddress());
	}

	public static void main(String[] args) {
		new EmulatorWindow(Hello.class);
	}
}
