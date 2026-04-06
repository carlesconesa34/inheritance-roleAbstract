/*
 * TestRunner.java Apr 2, 2026
 *
 *
 * ©Copyright 2026 Carles Conesa <a251158cc@correu.escoladeltreball.org>
 *
 * This is free software, licensed under the MIT License.
 * See https://opensource.org/licenses/MIT for more information.
 */

package role;

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
