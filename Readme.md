<b>Protocol Buffer</b> : Protocol Buffer is Google's mechanism for serializing structured data. It is smaller, faster, and simpler. It is language-neutral, platform-neutral, extensible

<br><br>
<i>Advantages</i> :
<ol> 
<li>Google created protocol buffer and using for their internal projects.</li>
<li>Data is typed that is we define data types in the proto file itself.</li>
<li>Smaller Faster and Simpler.</li>
<li>Code is automatically generated.</li>
<li>Data is Compressed Automatically.</li>


Setup :

we will need protobuf-java maven dependancy for proto generated classes<br>
and<br>
to generate code automatically add maven protoc dependendancy as mentioned in the following path<br>
protocol buffer maven configuration link : https://github.com/os72/protoc-jar-maven-plugin
<br>if you are compiling proto files by outside compiler then you only need protobuf-java dependancy
and other configuration can be skipped.
