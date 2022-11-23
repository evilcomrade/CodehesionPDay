class CreateAuthors < ActiveRecord::Migration[7.0]
  def change
    create_table :authors do |t|
      t.string :authorname
      t.text :createdby

      t.timestamps
    end
  end
end
