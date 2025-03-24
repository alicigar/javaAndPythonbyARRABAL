from flask import Flask, render_template
import pymysql
app = Flask(__name__)

try:
    print("Intentando conectar a la base de datos...")
    
    db = pymysql.connect(
    host="localhost",
    user="root",
    password="",
    database="escuela"
    )
    print("Conexión exitosa con la base de datos.")
except Exception as e:
    print(f"Error al conectar con la base de datos: {e}")
@app.route('/')
def mostrar_alumnos():
    cursor = db.cursor()
    cursor.execute("SELECT nombre FROM alumno")
    alumno = cursor.fetchall()
    cursor.close()
    alumno = [alumno[0] for alumno in alumno]
    return render_template('index.html', alumno=alumno)
if __name__ == '__main__':
    app.run(debug=True)
