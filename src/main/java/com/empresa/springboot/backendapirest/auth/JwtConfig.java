package com.empresa.springboot.backendapirest.auth;

public class JwtConfig {
	
	public static final String LLAVE_SECRETA = "alguna.clave.secreta.123456789";
	
	public static final String RSA_PRIVADA = "-----BEGIN RSA PRIVATE KEY-----\r\n"
			+ "MIIEpAIBAAKCAQEAvAIRzQ+JY6e5qU5piTf9GBRe9m997iXyTyMiQ7gXLTPQmmhc\r\n"
			+ "7709giwDGb+z7NH9GpFiAaC//iVt3rTy+XAnjVSwl2432YdvDl7b9RopgqoBQe1s\r\n"
			+ "zyQBtUNFPKi462FBCODmDhTZAQWEzG2L1JUhidtzctigZHLH5mM8x0bmaLwogo3N\r\n"
			+ "+QlyDboSvPEU6SulQOYcQ7EJlfha7osXxQ05E+1/1gSE2kznRVS0Csn+NeAL4GA8\r\n"
			+ "ZfgX/Rif2RdAaGSthh76IXKpeuecubsNGPX9uK3pgp9eURljFoczbJomXy9jyNnz\r\n"
			+ "GrGUxC5efZ+4DkDC8Wrwq4sRCJGA1r+xOCO7FQIDAQABAoIBAQCPesjZBRVlz1fa\r\n"
			+ "hLP3+5mUqd87FSU2/RCqIncA1Voirhtx61mZwINTd4E6QlnuzubpQrBX67T6INhz\r\n"
			+ "kQapJFWa/1nxhzTqNvijL/OPX1L0nAdvp+FVR/Zhvh/1xhGx2LvIKdKIRpLBu9N4\r\n"
			+ "K9X9+33n9mlp6Tam0g4KnguBTXOD012QT1cwX2fXLQOQhunDHjaVjyvlEnbA9+y7\r\n"
			+ "pEtH41fwkRX+MvzXQzDGBvIGVpQnHIhjl6LDjzjmxOipa3J6kHaqHbR8nXf1GneY\r\n"
			+ "bxSL6XFR045OB3+0XLF7jEpO0Lyx8nHqAqe7+6E2LGiXpFDos2KHw39oGFO7QrqM\r\n"
			+ "Xc52pdhhAoGBAObeKE9A9+GBA+fG6qzfeqR6wIT0ww8IHOuYuhk4ENjSuHn2HRCf\r\n"
			+ "ZtqkPhaNEFXMC/xLEoFTorxHIyAVgAOu4rbu2uazJAzwHZZ8ynbZiiJBBV2TA5Q5\r\n"
			+ "+fpZMnUoBHRrHByfnfSJNN9LjQn2xTThVuN2LrlO0nPf/slwYVE0/QKdAoGBANB5\r\n"
			+ "fnXXBvP2bdmxQYndmeEbc9G/7EkQZR+FJY1AqUYDR1gcjYr5qeRPW675bihywF9o\r\n"
			+ "/4IwairlYe0qFmP/oYR01lU7c0MK+UuAab22DVFtGYFeU7pYvUdbEBMcbM+0G/Bq\r\n"
			+ "hxa1doUH9Eqcry054ds06uiYolbX16Mzsax+xVTZAoGAeQs3hT4h+RjErGwNtK/D\r\n"
			+ "RKObdtpBvwrY5ul/gSN1KclpsYBJguKgcbg1WWuCigleq1vNCwOHykFd+D9tjADQ\r\n"
			+ "m2smWFjKaQIn8TPij2fFVepTXtlqwfeXyhukKereUw+pgJRro7+gegbJntTEVtJi\r\n"
			+ "1QWsv7nE+74Qfxst2v72PL0CgYBm/e6s1ts3gWIJrxlau+C+pipU0EUyX2gl50iC\r\n"
			+ "/RPjY9FGRWzj4K2+/jmkOtPiJbbGLAA22CZLJOF5IlbHdk3cO0B8AQ/TakN4umsC\r\n"
			+ "70KrHIQCNpCUuixgaSuK1XsoLamz31z3qhRwalqU1c1xQWxEOGNpH6br0lxU4z/+\r\n"
			+ "oO5qGQKBgQCs4oYphtkxQIn+Bugoqg9x64JFGjIHDZ70tmp+Bc3B92wGGupDnE5F\r\n"
			+ "GwgZfrAlZI69OC52AG3un49gr+4miVEbzu5nd+T8LpjU45vd499D2HI+Ohd2W0CG\r\n"
			+ "r8EEWFC4iqUsPOhX1mo8DIWOJyIrX7dKkGhdrNMV0TRymKPCScZbkw==\r\n"
			+ "-----END RSA PRIVATE KEY-----";
	
	public static final String RSA_PUBLICA = "-----BEGIN PUBLIC KEY-----\r\n"
			+ "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAvAIRzQ+JY6e5qU5piTf9\r\n"
			+ "GBRe9m997iXyTyMiQ7gXLTPQmmhc7709giwDGb+z7NH9GpFiAaC//iVt3rTy+XAn\r\n"
			+ "jVSwl2432YdvDl7b9RopgqoBQe1szyQBtUNFPKi462FBCODmDhTZAQWEzG2L1JUh\r\n"
			+ "idtzctigZHLH5mM8x0bmaLwogo3N+QlyDboSvPEU6SulQOYcQ7EJlfha7osXxQ05\r\n"
			+ "E+1/1gSE2kznRVS0Csn+NeAL4GA8ZfgX/Rif2RdAaGSthh76IXKpeuecubsNGPX9\r\n"
			+ "uK3pgp9eURljFoczbJomXy9jyNnzGrGUxC5efZ+4DkDC8Wrwq4sRCJGA1r+xOCO7\r\n"
			+ "FQIDAQAB\r\n"
			+ "-----END PUBLIC KEY-----";

}
