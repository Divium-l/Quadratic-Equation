package me.divium.QuadraticEquation;

import org.springframework.stereotype.Service;

@Service
public class EquationService {
    public RootModel getRoots(Double a, Double b, Double c) {
        RootStatus rootStatus;
        Double x1 = null;
        Double x2 = null;

        if (a == 0) {
            rootStatus = RootStatus.ONE_ROOT;
            x1 = -c / b;

            return new RootModel(x1, x2, rootStatus);
        }

        Double d = Math.pow(b, 2) - 4 * a * c;

        if (d == 0) {
            rootStatus = RootStatus.ONE_ROOT;
            x1 = -b / (2 * a);
        }

        else if (d < 0)
            rootStatus = RootStatus.NO_ROOTS;

        else {
            rootStatus = RootStatus.TWO_ROOTS;
            x1 = (-b + Math.sqrt(d)) / (2 * a);
            x2 = (-b - Math.sqrt(d)) / (2 * a);
        }

        return new RootModel(x1, x2, rootStatus);
    }
}