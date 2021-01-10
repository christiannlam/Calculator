import java.util.ArrayList;
import java.util.List;

public class CalculationCareTaker
{
    List<MementoCalculator> calc = new ArrayList<>();

    public void add(MementoCalculator m)
    {
        calc.add(m);
    }

    public MementoCalculator get(int index)
    {
        return calc.get(index);
    }
}
