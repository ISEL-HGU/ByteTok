package hgu.isel.structure.attribute.type.stack.verification.union;

import hgu.isel.structure.attribute.type.stack.verification.VerificationTypeInformation;

public class UninitializedVariableInformation implements VerificationTypeInformation {
    private final byte tag = 8;
    private byte[] offset; // u2
}
