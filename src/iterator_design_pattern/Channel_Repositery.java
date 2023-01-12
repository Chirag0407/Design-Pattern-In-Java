package iterator_design_pattern;

public class Channel_Repositery implements container{

    String channels[] = {"Sony", "Mony", "Tony"};
    @Override
    public iterator get_iterator() {
        return new ChannelIterator();
    }

    private class ChannelIterator implements iterator{
        int i = 0;
        @Override
        public boolean HasNext() {
            if(i < channels.length)
                return true;
            return false;
        }
        @Override
        public Object Next() {
            if(this.HasNext())
                return channels[i++];
            return null;
        }
    }
}
