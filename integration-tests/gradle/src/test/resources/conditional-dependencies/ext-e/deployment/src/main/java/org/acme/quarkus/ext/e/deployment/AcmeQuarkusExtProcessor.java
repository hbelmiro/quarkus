
package org.acme.quarkus.ext.e.deployment;

import io.quarkus.deployment.annotations.BuildStep;
import io.quarkus.deployment.builditem.FeatureBuildItem;

class AcmeQuarkusExtProcessor {

    private static final String FEATURE = "acme-quarkus-ext-e";

    @BuildStep
    FeatureBuildItem feature() {
        return new FeatureBuildItem(FEATURE);
    }

}