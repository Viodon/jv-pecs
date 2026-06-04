package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl implements MachineService<Machine> {
    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        final MachineProducer<Bulldozer> bulldozerProducer = new BulldozerProducer();
        final MachineProducer<Excavator> excavatorProducer = new ExcavatorProducer();
        final MachineProducer<Truck> truckProducer = new TruckProducer();
        List<? extends Machine> machines;
        if (type == Bulldozer.class) {
            machines = bulldozerProducer.get();
            return new ArrayList<>(machines);
        }
        if (type == Excavator.class) {
            machines = excavatorProducer.get();
            return new ArrayList<>(machines);
        }
        if (type == Truck.class) {
            machines = truckProducer.get();
            return new ArrayList<>(machines);
        }
        return List.of();
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (int i = 0; i < machines.size(); i++) {
            machines.get(i).doWork();
        }
    }
}
