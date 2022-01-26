public Student[] createClass(String[] names)
{
    Student[] st = new Student[names.length];
    for(int i = 0; i < st.length; i++) {
        st[i] = new Student(names[i]);
    }
    return st;
}
