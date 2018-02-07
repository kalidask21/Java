package com.bitcoin.services.crypto;

import java.util.Map;

public interface CryptoCoinInterface {

	Map<String,Object> callBitCoin();
	
	Map<String,Object> callLiteCoin();
	
	Map<String,Object> callEtherium();
	
	Map<String,Object> callRipple();
}
