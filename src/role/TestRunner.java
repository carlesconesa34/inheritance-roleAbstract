package role;

import org.junit.platform.launcher.Launcher;
import org.junit.platform.launcher.LauncherDiscoveryRequest;
import org.junit.platform.launcher.core.LauncherFactory;
import org.junit.platform.launcher.core.LauncherDiscoveryRequestBuilder;
import org.junit.platform.launcher.listeners.SummaryGeneratingListener;
import org.junit.platform.engine.discovery.DiscoverySelectors;

public class TestRunner {
    public static void main(String[] args) throws Exception {
        var listener = new SummaryGeneratingListener();
        LauncherDiscoveryRequest request = LauncherDiscoveryRequestBuilder.request()
            .selectors(DiscoverySelectors.selectClass(TestUnit.class))
            .build();
        Launcher launcher = LauncherFactory.create();
        launcher.discover(request);
        launcher.execute(request, listener);

        var summary = listener.getSummary();
        summary.getFailures().forEach(f ->
            System.out.println("FAIL: " + f.getTestIdentifier().getDisplayName()
                + " -> " + f.getException().getMessage()));
        System.out.println("\nTests passed: " + summary.getTestsSucceededCount()
                         + "/" + summary.getTestsStartedCount());
    }
}
