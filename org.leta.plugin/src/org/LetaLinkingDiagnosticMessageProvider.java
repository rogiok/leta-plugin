package org;

import org.eclipse.xtext.diagnostics.DiagnosticMessage;
import org.eclipse.xtext.linking.impl.LinkingDiagnosticMessageProvider;

@Deprecated
public class LetaLinkingDiagnosticMessageProvider extends LinkingDiagnosticMessageProvider {

    @Override
    public DiagnosticMessage getUnresolvedProxyMessage(ILinkingDiagnosticContext context) {
	return super.getUnresolvedProxyMessage(context);
    }

}
